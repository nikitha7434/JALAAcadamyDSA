document.getElementById("p").innerHTML="hello";

let obj ={
    firstname :"nikitha",
    secondname:"kalam"
}
let jsonobj =JSON.stringify(obj);

// strong data 
localStorage.setItem("test1json",jsonobj);

// geting data
let jsonobj2=localStorage.getItem("testjson");
let obj1 = JSON.parse(jsonobj);
document.getElementById("p").innerHTML= obj1.firstname;

console.log(jsonobj);