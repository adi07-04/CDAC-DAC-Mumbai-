const fetchuser = ()=>{
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve({data:{user:'Monkey',admin:true}});
        }, 3000);
    })
}

const login = ( user)=>{
    console.log(user);
    
    if(user.data.admin){
        console.log('Sucessfully Logged in');
        console.log('Program complete');
    }else{
        console.log('Failed to login, please try again');
    }
}
console.log('program started');

const validate = async() =>{
    var userobj = await fetchuser();
    login(userobj);
    
}

validate();


