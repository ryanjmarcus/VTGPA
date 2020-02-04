// content.js

dataTable = document.getElementsByClassName("dataentrytable")[0];

$('.dataentrytable').find('tr').each(function(){
    $(this).find('td').eq(7).after('<td class="deleft">GPA</td>');
});

dataTable.getElementsByTagName("tr")[0].getElementsByClassName("deleft")[0].className = "delabel"

for (let i = 0; i < dataTable.rows.length; i++) {    

    if (dataTable.getElementsByTagName("tr")[i].getElementsByClassName("deleft")[2]) {

        var course = dataTable.getElementsByTagName("tr")[i].getElementsByClassName("deleft")[0].innerText;
        var instructor = dataTable.getElementsByTagName("tr")[i].getElementsByClassName("deleft")[2].innerText;

        var subject = course.split('-')[0]
        var courseNum = course.split('-')[1]
        
        if (instructor.split(' ')[1]) {
            instructor = instructor.split(' ')[1];
        }

        var getURL = "https://obscure-citadel-49019.herokuapp.com/test/" + subject + "/" + courseNum + "/" + instructor;
        //var getURL = "http://localhost:8080/test/" + subject + "/" + courseNum + "/" + instructor;
        dataTable.getElementsByTagName("tr")[i].getElementsByClassName("deleft")[3].innerText = "";
    
        fetch(getURL)
        .then(response => response.json())
            .then(response => {
                dataTable.getElementsByTagName("tr")[i].getElementsByClassName("deleft")[3].style.backgroundColor = dataTable.getElementsByTagName("tr")[i].getElementsByClassName("deleft")[0].style.backgroundColor;
                
                if (response != "0") {
                    dataTable.getElementsByTagName("tr")[i].getElementsByClassName("deleft")[3].innerText = response;
                    dataTable.getElementsByTagName("tr")[i].getElementsByClassName("deleft")[3].style.color = "black";
                }
                else {
                    dataTable.getElementsByTagName("tr")[i].getElementsByClassName("deleft")[3].innerText = "P/F";
                    dataTable.getElementsByTagName("tr")[i].getElementsByClassName("deleft")[3].style.color = "black";
                }
                
        }, error => {
            console.error(error);
        });

    }


}




    