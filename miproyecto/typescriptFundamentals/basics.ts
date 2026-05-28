// Exercise 1
// Add types to this function — it takes two numbers and returns a number
function multiply(a: number, b: number): number {
  return a * b;
};

console.log(multiply(15, 25));

// Exercise 2
// Create an interface for a Product with name (string), price (number), inStock (boolean)
// Then create an array of 3 products using that interface

interface Product {
 name: string;
 price: number;
 inStock: boolean;
};

const prods: Product[] = [
  {name: "Fairy", price: 2, inStock: false},
  {name: "bread", price: 0.85, inStock: true},
  {name: "pineapple", price: 3.5, inStock: true}
]

console.log(prods);


// Exercise 3
// Take your products from Stage 1 and add types.
// Type the array, type the .map() result, type the .filter() result
interface Prod {
  name: string;
  price: number;
}

const products: Prod[] = [
  { name: "shirt", price: 20 },
  { name: "jeans", price: 50 },
  { name: "shoes", price: 80 }
];

const productNames: string[] = products.map((n: Prod) => n.name);
console.log(productNames);

const lessThanSixty: Prod[] = products.filter((n: Prod) => n.price < 60);
console.log(lessThanSixty);

console.log(products);

// Exercise 4
// Add types to this function and see what TS error appears
function getFirstItem(arr: number[]) {
  return arr[0];
}
getFirstItem([1, 2, 3]);

//toUpperCase() is a method for string values not numbers