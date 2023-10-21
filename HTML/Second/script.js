function submitForm() {
    let firstName = document.getElementById('firstName').value;
    let lastName = document.getElementById('lastName').value;
    let dob = document.getElementById('dob').value;
    let country = document.getElementById('country').value;
    let genders = document.querySelectorAll('#gender input:checked');
    let genderArray = Array.from(genders).map(g => g.value).join(', ');
    let profession = document.getElementById('profession').value;
    let email = document.getElementById('email').value;
    let mobile = document.getElementById('mobile').value;

    if(!firstName || !lastName || !dob || !country || !genderArray || !profession || !email || !mobile) {
        alert('Please fill all the fields!');
        return;
    }

    let message = `
        First Name: ${firstName}\n
        Last Name: ${lastName}\n
        Date of Birth: ${dob}\n
        Country: ${country}\n
        Gender: ${genderArray}\n
        Profession: ${profession}\n
        Email: ${email}\n
        Mobile Number: ${mobile}
    `;

    alert(message);

    document.getElementById('myForm').reset();
}

