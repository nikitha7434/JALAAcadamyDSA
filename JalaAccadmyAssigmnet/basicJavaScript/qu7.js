
//console.log('welcome console stric mode');
"use strict"; //global scope
a=20;
console.log(a);



function myfunction(){
   

    function nestedMethod(){
        "use strict" // function scope
        a=78
        return a;
    }
    return nestedMethod();
}
function mynotaStrictmode(){
    return " iam not a strict mode";
}

console.log(mynotaStrictmode());
let f =myfunction();
console.log(f);