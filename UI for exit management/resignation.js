document.getElementById('resignationForm').addEventListener('submit', raiseResignationRequest);

function formValidation() {

  var resignationRequestId = document.getElementById('resignationRequestId').value
  var exitReason = document.getElementById('exitReason').value
  var description = document.getElementById('description').value
  // var reasonType = document.getElementById('reasonType').value
  // var employeeId = document.getElementById('employeeId').value
  // var status = document.getElementById('status').value
  // var departmentName = document.getElementById('departmentName').value
  // var departmentId = document.getElementById('departmentId').value
  
  if(resignationRequestId == ''){
    alert('Resignation request id is required')
  }
  if (exitReason == '') {
    alert('Reason is required')
    return false
  }
  if (description == '') {
    alert('Description is required')
    return false
  }

  

  return true
}

function raiseResignationRequest() {
  if (formValidation() == true) {
    
    var resignationRequestId = document.getElementById('resignationRequestId').value;
    var exitReason = document.getElementById('exitReason').value;
    var description = document.getElementById('description').value;

    let headers = new Headers();

    headers.append('Content-Type', 'application/json');
    headers.append('Accept', 'application/json');
  
    
    headers.append('GET', 'POST', 'OPTIONS');

    const ResignationRequest = {};

    

    let url =  "http://localhost:9001/ResignationRequest/raiseResignationRequest?";

   
    ResignationRequest.resignationRequestId = document.getElementById('resignationRequestId').value;
    ResignationRequest.exitReason = document.getElementById('exitReason').value;
    ResignationRequest.description = document.getElementById('description').value;
    
    
      Object.keys(ResignationRequest).forEach((key) => {
        url += key + "=" + ResignationRequest[key] + "&";
    });
    

    fetch(url, {
      method: 'POST',
  })
      .then((response) => response.json())
      .then((data) => {
          if (data.status) {
              alert(data.message);
          }
      })
      .catch((error) => console.error(error));
       
    
      resignationRequestId.value = "";
      exitReason.value = "";
      description.value = "";

    }
  }





