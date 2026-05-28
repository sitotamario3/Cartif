const numbers = [1, 2, 3, 4, 5];

const numbersTimesThree = numbers.map(n => n * 3);

console.log(numbers);

console.log(numbersTimesThree);

const people = [
    {name : "James", age : 22, isWorking : true},
    {name : "Laura", age : 25, isWorking : true},
    {name : "Greg", age : 32, isWorking : false},
    {name : "Scott", age : 56, isWorking : true}
];

const users = people.map(n => "Name: " + n.name + ", Working: " + n.isWorking);

const activeUsers = people.filter(n => n.isWorking);

console.log(people);

console.log(users);

console.log(activeUsers);

// I had already seen the following in freecodecamp as part of the basics:
// Object destructuring
const user = { name: "Ana", age: 22, city: "Madrid" };

const { name, age } = user;
console.log(name); // "Ana"
console.log(age);  // 22

// Array destructuring
const coords = [40.4, -3.7];
const [lat, lng] = coords;
console.log(lat); // 40.4

// In function parameters — you'll see this CONSTANTLY in React
function greet({ name, age }) {
  return `Hi ${name}, you are ${age}`;
}
greet(user); // "Hi Ana, you are 22"

// Copy an array
const original = [1, 2, 3];
const copy = [...original];

// Merge arrays
const a = [1, 2];
const b = [3, 4];
const merged = [...a, ...b]; // [1, 2, 3, 4]

// Copy an object
const user = { name: "Ana", age: 22 };
const updated = { ...user, age: 23 }; // override age
console.log(updated); // { name: "Ana", age: 23 }

// This however is new:

const numbers = [1, 2, 3, 4];

const sum = numbers.reduce((accumulator, current) => {
  return accumulator + current;
}, 0); // <-- 0 is the starting value

console.log(sum); // 10

// Step by step:
// start:  acc=0
// item 1: acc = 0 + 1 = 1
// item 2: acc = 1 + 2 = 3
// item 3: acc = 3 + 3 = 6
// item 4: acc = 6 + 4 = 10