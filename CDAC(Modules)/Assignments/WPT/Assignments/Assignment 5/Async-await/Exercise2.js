const fetchfast = () =>{
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve('Fast Done!');     
        }, 2000);
    })
}

const fetchSlow = () =>{
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve('Slow Done!');     
        }, 6000);
    })
}

console.log("Program starting...");
var starttime = new Date();

const fetch = async () =>{
    const data1 = await fetchfast();
    console.log(data1);
    
    const data2 = await fetchSlow();
    console.log(data2);

    console.log("Program complete!");
    var endtime = new Date();
    console.log("Program completed in",endtime-starttime);
    
}

fetch();

