import tkinter as tk
from tkinter import messagebox

class BudgetShoppingApp:
    def __init__(self, root):
        self.root = root
        self.root.title("Smart Budget Shopper")
        self.root.geometry("450x500")
        
        # Data tracking
        self.budget = 100.00
        self.shopping_list = []  # Contains dicts: {"name": str, "price": float, "bought": bool}
        
        self.create_widgets()
        self.update_ui()

    def create_widgets(self):
        # --- Budget Header Section ---
        header_frame = tk.Frame(self.root, bg="#f0f0f0", padding=10)
        header_frame.pack(fill="x")
        
        self.budget_label = tk.Label(header_frame, text=f"Budget: ${self.budget:.2f}", font=("Arial", 12, "bold"))
        self.budget_label.pack(side="left")
        
        self.remaining_label = tk.Label(header_frame, text="Remaining: $0.00", font=("Arial", 12))
        self.remaining_label.pack(side="right")

        # --- Input Section ---
        input_frame = tk.Frame(self.root)
        input_frame.pack(pady=10, fill="x", px=10)
        
        tk.Label(input_frame, text="Item Name:").grid(row=0, column=0, sticky="w")
        self.item_name_entry = tk.Entry(input_frame, width=20)
        self.item_name_entry.grid(row=0, column=1, padx=5, pady=5)
        
        tk.Label(input_frame, text="Price ($):").grid(row=1, column=0, sticky="w")
        self.item_price_entry = tk.Entry(input_frame, width=10)
        self.item_price_entry.grid(row=1, column=1, padx=5, pady=5, sticky="w")
        
        self.add_btn = tk.Button(input_frame, text="Add Item", command=self.add_item, bg="#4CAF50", fg="white")
        self.add_btn.grid(row=1, column=2, padx=10)

        # --- List Display Section ---
        self.canvas = tk.Canvas(self.root, borderwidth=0, background="#ffffff")
        self.list_frame = tk.Frame(self.canvas, background="#ffffff")
        self.scrollbar = tk.Scrollbar(self.root, orient="vertical", command=self.canvas.yview)
        self.canvas.configure(yscrollcommand=self.scrollbar.set)

        self.scrollbar.pack(side="right", fill="y")
        self.canvas.pack(side="left", fill="both", expand=True, padx=10, pady=10)
        self.canvas.create_window((0,0), window=self.list_frame, anchor="nw")
        
        self.list_frame.bind("<Configure>", lambda event: self.canvas.configure(scrollregion=self.canvas.bbox("all")))

    def add_item(self):
        name = self.item_name_entry.get().strip()
        price_str = self.item_price_entry.get().strip()
        
        if not name or not price_str:
            messagebox.showwarning("Input Error", "Please fill out both Name and Price fields.")
            return
            
        try:
            # Bug Hunting Hint: Check how the price is being handled
            price = int(price_str) 
            
            if price < 0:
                messagebox.showwarning("Input Error", "Price cannot be negative.")
                return
        except ValueError:
            messagebox.showerror("Input Error", "Price must be a valid number.")
            return

        # Add item to the master data tracking list
        self.shopping_list.append({
            "name": name,
            "price": price,
            "bought": False
        })
        
        # Clear inputs
        self.item_name_entry.delete(0, tk.END)
        self.item_price_entry.delete(0, tk.END)
        
        self.update_ui()

    def toggle_item_status(self, index):
        # Inverts the 'bought' status when checkbox is clicked
        self.shopping_list[index]["bought"] = not self.shopping_list[index]["bought"]
        self.update_ui()

    def update_ui(self):
        # Clear out the old widgets in the list frame so we can redraw them safely
        for widget in self.list_frame.winfo_children():
            widget.destroy()
            
        total_spent = 0.0
        
        # Redraw the list based on updated data array
        for idx, item in enumerate(self.shopping_list):
            item_row = tk.Frame(self.list_frame, bg="white", pady=2)
            item_row.pack(fill="x", expand=True)
            
            # Checkbox to mark as bought
            # Bug Hunting Hint: Pay close attention to variables and loops in Tkinter checkboxes!
            is_checked = tk.BooleanVar(value=item["bought"])
            cb = tk.Checkbutton(item_row, variable=is_checked, command=lambda: self.toggle_item_status(idx), bg="white")
            cb.pack(side="left")
            
            # Item Name & Price text styling
            label_text = f"{item['name']} - ${item['price']:.2f}"
            lbl = tk.Label(item_row, text=label_text, bg="white", font=("Arial", 10))
            if item["bought"]:
                lbl.config(fg="gray", font=("Arial", 10, "overstrike")) # cross out text if bought
                total_spent += item["price"]
                
            lbl.pack(side="left", padx=5)

        # Update budget calculations at the top
        remaining = self.budget - total_spent
        self.remaining_label.config(text=f"Remaining: ${remaining:.2f}")
        
        if remaining < 0:
            self.remaining_label.config(fg="red")
        else:
            self.remaining_label.config(fg="black")


if __name__ == "__main__":
    root = tk.Tk()
    app = BudgetShoppingApp(root)
    root.mainloop()