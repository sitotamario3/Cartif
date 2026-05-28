// Exercise 1 — map
// Given this array of products, create a new array with just the prices doubled (sale!)
/*const products = [
  { name: "shirt", price: 20 },
  { name: "jeans", price: 50 },
  { name: "shoes", price: 80 },
];

const sale = products.map(n => `name: ${n.name}, price: ${n.price * 2}`);
console.log(sale);*/
// expected output: [40, 100, 160]

// Exercise 2 — filter
// Keep only products that cost more than 30
// expected output: [{name:"jeans",...}, {name:"shoes",...}]

/*const overThirty = products.filter(n => n.price > 30);
console.log(overThirty);*/

// Exercise 3 — reduce
// Calculate the total price of all products
// expected output: 150

/*let prices = products.map(n => n.price);
console.log(prices);*/

const totalPrice = prices.reduce((accumulator, current) => {
    return accumulator + current;
}, 0);
console.log(totalPrice);


// Exercise 4 — destructuring + spread
// Given this user, create a new object with the same data but city changed to "Barcelona"
const user = { name: "Ana", age: 22, city: "Madrid" };
// hint: use spread ...

const user2 = {...user, city: "Barcelona"};
console.log(user2);

// Exercise 5 — async/await
// Fetch real data from JSONPlaceholder and log only the users whose name starts with "E"
// hint: fetch, then filter
async function getUsers() {
  const response = await fetch('https://jsonplaceholder.typicode.com/users');
  const users = await response.json();
  const usersStartingWithE = users.filter(n => n.name.charAt(0) === "E");
  console.log(usersStartingWithE);
}
getUsers();