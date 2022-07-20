//TEAM 5: Teachers+++++ Seth A, Usman A, Latoya B, Joel B
//LIVECODING ANNOTATION TASK

//Overall Question: How are you able to create buttons that uses click events to control data contained in variables?

//Big idea: Create a button and establish the change interval for when the button is pushed (Change the contents of an element using the .innerHTML property and either the = assignment operator (to reset content) or the += incrementation operator (to append content).)

//Big Reveal: Being able to use variable and show user interactions in terms of event listener and query selctor. Intervals are changed based on the interactions with the event listener. 

//Deliberate Error: Create an error where the student has to determine whether they are looking for the button or the value? 


console.log('Welcome to Elephant Life')

//1. Create variables to track the information (Store 2+ pieces of information in JS variables
let Nutrition = 100 //PROVIDED
let Rest = 100 //Live code with students
//let Energy = 100  //code to be written by students

//2. Setup Query Selectors for each button (Select elements on a page using querySelector)
let NutritionButton = document.querySelector('#Nutrition') //PROVIDED
let RestButton = document.querySelector('#Rest')
//let EnergyButton = document.querySelector('#Energy') //code to be written by students

//3. Setup Query Selectors for each value
//Must Answer Question: "What other part of the HTML code do we need to link to besides the clickable button?"
let NutritionValue = document.querySelector('#Nutrition-value') //PROVIDED
let RestValue = document.querySelector('#Rest-value')
//let EnergyValue = document.querySelector('#Energy-value') //code written by students


//Add in some timed functions that slowly decrement the creature's stats.
setInterval(decreaseValue, 2000) //PROVIDED built-in js function that runs automatically every 2seconds

function decreaseValue(){ //PROVIDED
  console.log("check") //PROVIDED
  Nutrition-=5 //PROVIDED
  NutritionValue.innerHTML=`${Nutrition}` //PROVIDED

  //4. Update the decreasing values for each button
  Rest-=10
  RestValue.innerHTML=`${Rest}`

  //code to be written by students
  // Energy-=15
  // EnergyValue.innerHTML=`${Energy}`
}

//Event Listener - what happens with click
//PROVIDED Nutrition Event Listener
NutritionButton.addEventListener("click", e=>{
  console.log('nutrition button clicked')
  Nutrition+=10
  NutritionValue.innerHTML=`${Nutrition}`
})

//5. Create eventListener for the RestButton
//Student Prompt: Why is event listener relevant? Would you be able to do this without event listener?
RestButton.addEventListener("click", e=>{
  console.log('rest button clicked')
  Rest+=10
  RestValue.innerHTML=`${Rest}`
})

//code to be written by students
// EnergyButton.addEventListener("click", e=>{
//   console.log('energy button clicked')
//   Energy+=10
//   EnergyValue.innerHTML=`${Energy}`
// })
