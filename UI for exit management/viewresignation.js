function showData() {
        
 
    fetch("http://localhost:9001/ResignationRequest/getAllResignationRequests").then((data) => {
    
      
    return data.json();
      })
        .then((data) => {
          console.log(data.requests
            );
            var response = data.requests;
            console.log(response);
              var html = '';
              response.forEach(function (element, index) {
                console.log(element);  
                html += '<tr>'     
                html += '<td>' + element.resignationRequestId + '</td>'
                html += '<td>' + element.exitReason + '</td>'
                html += '<td>' + element.description + '</td>'
                html += '<td' + element.reasonType + '</td>'
                html += '<td>'+ element.employeeId + '</td>'
                html += '<td>' + element.departmentName + '</td>'
                html += '<td>' + element.departmentId + '</td>'                
            
                
              })
            
              document.querySelector('#myTable tbody').innerHTML = html
            
    })
        }
        document.onload = showData()
