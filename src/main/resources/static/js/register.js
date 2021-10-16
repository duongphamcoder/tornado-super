const $ = document.querySelector.bind(document)
const $$ = document.querySelectorAll.bind(document)

function showRegister(options, value) {
  const content = $(".content");
  const th =  "th:text='${error}'"
  content.innerHTML = `
    <div class="form_regis">
    <form ${options.name ? options.name : ''} ${options.action} id="form_regis" method="post"  ${options.obj ? ' th:object="&#36;{user}"' : ' '}>  
        <h1>${options.headerName}</h1>
        <div class="list__form"> 
        </div>
        <div class="policy__and__btn">
           <div class="policy__list">
                <div class="policy__item">
                    <input type="checkbox" name="" id="yess">
                    <label for="yess">Đồng ý với <a href="#">Chính sách & Quy định chung</a> (*)</label>
                </div>
                <div class="policy__item">
                    <input type="checkbox" name="" id="gift">
                    <label for="gift">Nhận chương trình khuyến mã qua Email</label>
                </div>
           </div>
            <div class="regis__btn">
               <div> <span class="forgot__password ${options.gender ? " " : "active"}">
                            Nếu bạn quên mật khẩu thì click <a href="#">Vào Đây</a>.</span>
               </div>
                <button type="submit" class="regis__submit">${options.headerName}</button>
            </div>
            <div class="regis__btn">
                <a href="#" class="regis__submit regis__fb">${
                  options.headerName.toUpperCase() +
                  " bằng Facebook".toUpperCase()
                }</a>
                <a href="#" class="regis__submit regis__gg">${
                  options.headerName.toUpperCase() +
                  " bằng Google".toUpperCase()
                }</a>
            </div>
        </div>
    </form> 
</div>
    `;

  const htmls = options.list.map((element) => {
    return `<div class="list__form-item">
        <label for=${element.for} >${element.name}</label>
        <input type=${element.type} id=${element.for}   ${element.field ? element.field : ''}  name=${element.for} required></div>`;
  });
  if (options.gender) {
    const temp = `<div class="list__form-item">
                                    <label for="">Giới tính</label>
                                    <div class="gender__list">
                                     </div>
                                </div>`;
    const gender = options.gender.map((element) => {
      return `<div class="gender__item">
            <input type="radio" name="gender" id=${element.value} value=${element.value} required>
            <label for=${element.value}>${element.name}</label></div>`;
    });
    htmls.push(temp);
    const list__form = $(".list__form");
    list__form.innerHTML = htmls.join("");

    const policyList = $(".policy__list");
    policyList.classList.add("active");
    const genderList = $(".gender__list");
    genderList.innerHTML = gender.join("");
  } else {
    const list__form = $(".list__form");
    list__form.innerHTML = htmls.join("");
  }


  ;(function() {
    if(value == '') {
        const password = document.getElementById('password')
        const confirm =document.getElementById('confirm')
        const regiter = document.querySelector('.regis__submit')
        function checkvalid() {
                if(password.value != confirm.value) {
                  confirm.setCustomValidity("Passwords Don't Match");
                }
                else {
                    confirm.setCustomValidity('');
                }
        }
        regiter.addEventListener('click', () => {checkvalid()})
    }
}())
}
