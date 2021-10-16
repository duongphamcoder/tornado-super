function newHeader() {
  var header = document.querySelector(".main__header");
  const checklog = document.querySelector("#checklog").textContent;
  const user_name = document.querySelector("#user_name").textContent;

  header.innerHTML = `   <div class="header">
    <div class="logo__jolli">
        <a href="/">
            <img src="../img/logo__new.png" alt="" class="logo__jolli-item">
        </a>
    </div>

    <div class="header__nav ">  
        <div class="form">
            <a  href="/infor-user" class="form__link">
                 <div class="form-icon">
                     <i class="far fa-user icon-user"></i>
                </div>
            </a>
            <a href="/login" class="form__link">
            <div class="login__or__register" id="no__login">
            <a href="/register" class="register">Đăng ký</a>
            <span class="seperate">/</span>
            <a href="/login" class="login">Đăng nhập</a>
        </div>
       </a>
            <div class="login__or__register" id="login__success" style="display: none;">
                <a href="/infor-user" class="user__link" >${user_name}</a>
                <form action="/logout" method="post">
                    <label class="logout__btn" for="logout">Đăng Xuất</label>
                    <input type="submit" hidden name="" id="logout" />
                </form>
            </div>
            
            <div class="language">
                <a href="#" class="language-item language-active">VN</a>
                <a href="#" class="language-item">ENG</a>
            </div>
        </div>
    <ul class="navbar">
        <li class="navbar__item ">
            <a href="/" class="navbar__link">
                TRANG CHỦ
            </a>
        </li>
        <li class="navbar__item">
            <a href="/thuc-don/ga-gion-vui-ve" class="navbar__link">
                THỰC ĐƠN
            </a>

            <ul class="navbar__menu">
                <li class="navbar__menu-item">
                    <a href="/thuc-don/mon-moi-mon-ngon" class="navbar__menu-link">
                        <img src="../img/logmenu1.png" alt="" class="img__menu">
                        <h3>COMBO</h3>
                    </a>
                </li>
                <li class="navbar__menu-item">
                    <a href="/thuc-don/ga-gion-vui-ve" class="navbar__menu-link">
                        <img src="../img/logmenu2.png" alt="" class="img__menu">
                        <h3>GÀ GIÒN</h3>
                    </a>
                </li>
                <li class="navbar__menu-item">
                    <a href="/thuc-don/ga-sot-cay" class="navbar__menu-link">
                        <img src="../img/logmenu3.png" alt="" class="img__menu">
                        <h3>GÀ SỐT CAY</h3>
                    </a>
                </li>
                <li class="navbar__menu-item">
                    <a href="/thuc-don/mi-y-sot-bo-bam" class="navbar__menu-link">
                        <img src="../img/logmenu4.png" alt="" class="img__menu">
                        <h3>MỲ Ý SỐT BÒ BẰM</h3>
                    </a>
                </li>
                <li class="navbar__menu-item">
                    <a href="/thuc-don/burger-com" class="navbar__menu-link">
                        <img src="../img/logmenu5.png" alt="" class="img__menu">
                        <h3>BURGER & CƠM</h3>
                    </a>
                </li>
                <li class="navbar__menu-item">
                    <a href="/thuc-don/phan-an-phu" class="navbar__menu-link">
                        <img src="../img/logmenu6.png" alt="" class="img__menu">
                        <h3>PHẦN ĂN PHỤ</h3>
                    </a>
                </li>
                <li class="navbar__menu-item">
                    <a href="/thuc-don/mon-trang-mieng" class="navbar__menu-link">
                        <img src="../img/logmenu7.png" alt="" class="img__menu">
                        <h3>MÓN TRÁNG MIỆNG</h3>
                    </a>
                </li>
            </ul>
        </li>
            <li class="navbar__item">
                <a href="/dich-vu" class="navbar__link" >
                    DỊCH VỤ
                </a>
            </li>
            <li class="navbar__item">
                <a href="/lien-he" class="navbar__link">
                    LIÊN HỆ
                </a>
            </li>
            <li class="navbar__item">
                <a href="/tuyen-dung" class="navbar__link">
                    TUYỂN DỤNG
                </a>
            </li>
        </ul>
        </div>

    <div class="logo__phoneNumber">
        <img src="../img/logoPhoneNumber.png" alt="">
    </div>
</div>
<div class="main__header-scroll">
<ul class="navbar__menu1"> </ul> 
`;

  const navbar__menu1 = document.querySelector(".navbar__menu1")
  navbar__menu1.innerHTML = document.querySelector(".navbar__menu").innerHTML

  // handleScroll
  if (location.pathname == "/") {
    document.onscroll = () => {
      if (Math.floor(document.documentElement.scrollTop) >= 80) {
        document.querySelector(".main__header-scroll").style.display = "flex"
        document.querySelector(".main__header-scroll").style.animation =
          "identifier 0.2s  ease-in";
        document.querySelector(".header").style.display = "none"
      } else {
        document.querySelector(".main__header-scroll").style.display = "none"
        document.querySelector(".main__header-scroll").style.animation = "none"
        document.querySelector(".header").style.display = "flex"
      }
    };
  }

  if (checklog != "") {
    document.getElementById("no__login").style.display = "none"
    document.getElementById("login__success").style.display = "flex"
  }
}


(function() {
    const link = document.createElement("link")
link.rel = "shortcut icon"
link. href="../img/logo__new.png"
document.querySelector("head").appendChild(link)
})()
