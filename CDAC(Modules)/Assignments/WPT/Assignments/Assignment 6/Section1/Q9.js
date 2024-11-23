

function restoperator(...input){
    let total = 0;
    for (let i of input){
        total=total+i;
    }
    return total;
}

console.log(restoperator(10,20,30,40));
