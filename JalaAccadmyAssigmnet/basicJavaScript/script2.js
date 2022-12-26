


//program for loop;

const arr =['red','blue','maroon','purple','sliver','green','yellow','navy','teal'];


function myfunction(){
for(var i=0;i<arr.length;i++){

    let ele =Math.random()*arr.length;
    let color =arr[Math.floor(ele)];
  document.body.style.backgroundColor=color;
}
}
//for/in
for(let variable in arr){
    console.log("for/in", variable);
}
//for/of
for(let variable of arr){
    console.log("for /of");
    console.log(variable);
}
//foreach
arr.forEach(element => {
    
    console.log("for each" ,element);
    
});


