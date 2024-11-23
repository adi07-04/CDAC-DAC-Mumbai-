var cart = [99,39,149,999,599,699];
var total = 0;
var value = cart.reduce((total,num) => {
    return total+num;
}
);
console.log(value);
