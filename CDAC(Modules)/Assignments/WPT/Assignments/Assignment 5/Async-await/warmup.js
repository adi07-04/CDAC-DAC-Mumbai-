const fetchPokemon = ()=>{
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            // resolve({data:{name:'Pikachu', power:20}});
            reject(new Error('Danger!'));
        }, 2000);
    })
}
console.log("Program started...");

const asyncfunction = async ()=>{
    try{
        const data = await fetchPokemon();
    }catch(Error){
        console.log(Error);
    }
    console.log('Program Completed');
}


asyncfunction();
