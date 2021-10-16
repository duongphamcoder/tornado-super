function contentHome() {
    var contentHome = document.querySelector(".content");
    contentHome.innerHTML = `
    <div class="eat__what">
    <div class="grid max__wide">
        <div class="row">
            <div class="col l-3 m-12 eat__what-item1">
                <div class="eat__what-logo">
                    <img src="./img/logo__new.png" alt="">
                </div>
                <div class="eat__what-content">
                    <h1>ĂN GÌ HÔM NAY</h1>
                    <span>Tại TornadoSuper có thực đơn đa dạng và phong phú, có rất nhiều sự lựa chọn cho bạn, gia đình và bạn bè.
                    </span>
                </div>
            </div>
            <div class="col l-9 m-12">
                <div class="grid max__wide">
                    <div class="row">
                        <div class="col l-3 m-3">
                            <a href="/thuc-don/ga-gion-vui-ve" class="eat__what-link" style="background-image: url(./img/eat__what.jpg);">
                                <img src="./img/eat__what-logo4.jpg" alt="">
                                
                                <div class="eat__what-item2">
                                    <img src="./img/label__eat-what1.png" alt="">
                                    <span class="eat__what-btn">ĐẶT HÀNG</span>
                                </div>
                            </a>    
                        </div>
                        <div class="col l-3 m-3">
                            <a href="/thuc-don/ga-sot-cay" class="eat__what-link" style="background-image: url(./img/eat__what.jpg);">
                                <img src="./img/eat__what-logo3.jpg" alt="">
                                <div class="eat__what-item2">
                                    <img src="./img/label__eat-what2.png" alt="">
                                    <span class="eat__what-btn">ĐẶT HÀNG</span>

                                </div>
                            </a>
                        </div>
                        <div class="col l-3 m-3">
                            <a href="thuc-don/mi-y-sot-bo-bam" class="eat__what-link" style="background-image: url(./img/eat__what.jpg);">
                                <img src="./img/eat__what-logo2.jpg" alt="">
                                <div class="eat__what-item2">
                                    <img src="./img/label__eat-what3.png" alt="">
                                    <span class="eat__what-btn">ĐẶT HÀNG</span>

                                </div>
                            </a>
                        </div>
                        <div class="col l-3 m-3">
                            <a href="/thuc-don/mon-trang-mieng" class="eat__what-link" style="background-image: url(./img/eat__what.jpg);">
                                <img src="./img/eat__what-logo1.jpg" alt="">
                                <div class="eat__what-item2">
                                    <img src="./img/label__eat-what4.png" alt="">
                                    <span class="eat__what-btn">ĐẶT HÀNG</span>

                                </div>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="service" style="background-image: url(./img/background__service.png);">
    <div class="grid wide">
        <div class="service__header">
            <h1>DỊCH VỤ</h1>
            <H3>TẬN HƯỞNG NHỮNG KHOẢNH KHẮC TRỌN VẸN CÙNG JOLLIBEE</H3>
        </div>
        <div class="row">
            <div class="col l-4">
                <a href="/dich-vu/kid-party" class="service-item">
                    <div class="service__img">
                        <img src="./img/birthday.jpg" alt="">
                    </div>
                    <div class="service__btn">
                        <span>ĐẶT TIỆC SINH NHẬT</span>
                        <span class="btn-item">XEM THÊM</span>
                    </div>
                </a>
            </div>
            <div class="col l-4">
                <a href="/dich-vu/kid-club" class="service-item">
                    <div class="service__img">
                        <img src="./img/kid__club.jpg" alt="">
                    </div>
                    <div class="service__btn">
                        <span>JOLLIBEE KID CLUB</span>
                        <span class="btn-item">XEM THÊM</span>

                    </div>
                </a>
            </div>
            <div class="col l-4">
                <a href="/dich-vu/big-order" class="service-item">
                    <div class="service__img">
                        <img src="./img/service__img3.png" alt="">
                    </div>
                    <div class="service__btn">
                        <span>ĐƠN HÀNG LỚN</span>
                        <span class="btn-item">XEM THÊM</span>
                    </div>
                </a>
            </div>
        </div>
    </div>
</div>
<div class="jollibee__hello"  style="background-image: url(./img/jollibee__hello-bgr.jpg);">
    <div class="jollibee__hello-header">
        <h1>CÓ GÌ KHÓ ĐÃ CÓ TORNADO SUPER LO</h1>
    </div>
    <div class="jollibee__hello-content">
        <span>Chúng tôi là Tornado Super Việt Nam với hơn 100 cửa hàng 
            trên khắp cả nước, chúng tôi mong muốn đem đến niềm vui
             ẩm thực cho mọi gia đình Việt bằng những món ăn có chất
              lượng tốt, hương vị tuyệt hảo, dịch vụ chu đáo với một mức
               giá hợp lý… Hãy đến và thưởng thức nhé!
        </span>
    </div>
    <div class="jollibee__hello-btn">
        <a href="/thuc-don/ga-gion-vui-ve" class="jollibee__hello-btn-item">ĐẶT HÀNG</a>
    </div>
</div>
    `;
}

contentHome();


function contentLinkHover() {
    let list = document.querySelectorAll(".eat__what-link");
    let size = list.length;
    for(let i = 0; i < size; i++) {
        list[i].addEventListener("mousemove",function () {
           this.style.backgroundImage = "url(./img/eat__what2.jpg)"
        })

        list[i].addEventListener("mouseout",function () {
            this.style.backgroundImage = "url(./img/eat__what.jpg)"
         })
    }
}

contentLinkHover();