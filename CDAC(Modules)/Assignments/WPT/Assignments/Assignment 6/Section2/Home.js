var expenses = [
    
];
if(!localStorage.getItem('Expenses')){
    localStorage.setItem('Expenses',JSON.stringify(expenses));
}
document.getElementById("form").addEventListener('submit',AddExpense);


function AddExpense() {
    event.preventDefault();
    var amt = document.getElementById('Amount').value;
    var desc = document.getElementById('desc').value;
    var d = new Date();
    var currdate = d.getDate()+'-'+d.getMonth()+'-'+d.getFullYear();
    var currtime = d.getHours()+'hr '+d.getMinutes()+'min '+d.getSeconds()+"sec";
    console.log(desc);
    
    if(amt < 1 || amt == null ){
        return alert('Please Enter Valid Values')
    }
    
    var storedrecords = JSON.parse(localStorage.getItem('Expenses')) || [];

    exp = {
        Amount : Number(amt),
        Description : desc,
        date : currdate,
        time : currtime
    };
    
    storedrecords.push(exp);
    localStorage.setItem('Expenses',JSON.stringify(storedrecords));
    alert('Expense Added Successfully');
    location.reload();
}

function display() {
    var TotalAmount = 0.00;
    var storedrecords = JSON.parse(localStorage.getItem('Expenses')) || [];
    
    var tablebody = document.getElementById('table-body');
    var Total = document.getElementById('Total');
    storedrecords.forEach(record => {
        row = document.createElement('tr');
        col1 = document.createElement('td');
        col1.innerText = record.Amount;
        TotalAmount = TotalAmount+record.Amount;

        col2 = document.createElement('td');
        col2.innerText = record.Description;col2.innerText = record.Description;

        col3 = document.createElement('td');
        col3.innerText = record.date;

        col4 = document.createElement('td');
        col4.innerText = record.time;
        row.appendChild(col1);
        row.appendChild(col2);
        row.appendChild(col3);
        row.appendChild(col4);
        tablebody.appendChild(row);
        Total.innerText = "Total Expenditure: "+ TotalAmount;
    });

}
display();



   
 