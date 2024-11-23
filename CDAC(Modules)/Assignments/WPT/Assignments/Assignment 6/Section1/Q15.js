var arr = [1,2,3,4,5];

function operations(arr) {
    arr.filter((val,index) => {
        if(val % 2 != 0){
            arr.splice(index,1);
        }
    } );

   arr.map((val,index) => {arr[index] = val*2});

   return arr.reduce((total,num) => {return total = total+ num});

} 
res = operations(arr);
console.log(res);
