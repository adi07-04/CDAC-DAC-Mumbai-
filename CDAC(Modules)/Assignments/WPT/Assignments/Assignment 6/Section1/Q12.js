var mypromise = new Promise((resolve,reject)=>{
    setTimeout(() => {
        resolve("Promise completed");
    }, 3000);
});

mypromise.then((msg)=>{
    console.log(msg);
})