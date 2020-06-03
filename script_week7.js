function validate()
{
    if (document.getElementById("add").checked || document.getElementById("substract").checked || document.getElementById("divide").checked || document.getElementById("mutiply").checked))
    {
        if (document.getElementById("divide").checked && document.getElementById(num2).value == 0) {
            document.getElementById("answer").textContent = "Invalid Input";
        }
        else {
            operator1();
        }

    }
    else
    {
        document.getElementById("answer").textContent = "Please Select an option";
    }
}
const form = document.getElementById('form');
form.addEventListener('submit', validate);

function operator1()
{
   var ans ;
    if (document.getElementById("add").checked) {
        document.getElementById("answer").innerHTML = "hello";
        ans = calculate('add');
        document.getElementById("answer").innerHTML = ans;
   }
    if (document.getElementById("subtract").checked) {
        ans = calculate('subtract');
        document.getElementById("answer").innerHTML = ans;
    }
    if (document.getElementById("multiply").checked) {
        ans = calculate('multiply');
        document.getElementById("answer").innerHTML = ans;
    }
    if (document.getElementById("divide").checked) {
        ans = calculate('divide');
        document.getElementById("answer").innerHTML = ans;
    } 
}
function calculate(action) {
    var num1 = document.getElementById("num1").value;
    var num2 = document.getElementById("num2").value;
    document.getElementById("answer").innerHTML = ;
    var result;
    switch (action) {
        case 'add':
            result =num1 + num2;
            break;
        case 'subtract':
            result = num1 - num2;
            break;
        case 'multiply':
            result = num1 * num2;
            break;
        case 'divide':
            result = num1 / num2;
            break;
    }
    return result;
}
var emp =
    '{' +
        '"employee" :' +
               '[' +
               ']' +
    '}';
document.querySelector("#add").addEventListener("click", function () {
    var id = document.querySelector("#id").value;
    var name = document.querySelector("#name").value;
    var department = document.querySelector("#department").value;
    var gender = document.querySelector("#gender").value;
    emp.employee.push({ "id": id, "name": name, "department": department, "gender": gender });
    
});
document.querySelector("#search").addEventListener("click", function () {
    var name = document.querySelector("#searchName").value;
    var data = document.querySelector("#searchTbody");
    data.innerHTML = '';
    for (var employee of emp.employee)
    {
        if (employee.name == name)
        {
            var row = "`<tr>
                        <td>"+employee.id+"</td>
                        <td>"+employee.name+"</td>
                        <td>"+employee.department+"</td>
                        <td>"+employee.gender+"</td>
                   </tr>";
            data.innerHTML += row;
 
        }

    }

});
document.querySelector("#show").addEventListener("click", function ()
{
    var data = document.querySelector("#showTable");
    data.innerHTML = "";
    for (var employee of emp.employee)
    {
        var row = "`<tr>
            < td > "+employee.id+"</td>
                <td>"+employee.name+"</td>
                <td>"+employee.department+"</td>
                <td>"+employee.gender+"</td>
                   </tr > ";
        data.innerHTML += row;



    }
