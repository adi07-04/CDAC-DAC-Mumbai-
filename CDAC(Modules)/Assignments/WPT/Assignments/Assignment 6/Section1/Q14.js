
 async function  getval() {
    curr = await fetch("https://api.metalpriceapi.com/v1/latest?api_key=40f967f5441b75c03294b64b736ffc14&base=USD&currencies=INR,AUD,PKR");
    const data = await curr.json()  ;
    console.log("1 USD = "+data);
} 
getval();



