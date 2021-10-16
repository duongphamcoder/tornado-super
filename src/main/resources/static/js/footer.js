function footer() {
    var footer = document.querySelector(".footer");
    footer.innerHTML = `
    <div class="grid max__wide">
    <div class="row">
        <div class="col l-3">
            <div class="footer__img">
                <img src="../img/logo__new.png" alt="">
            </div>
        </div>
        <div class="col l-3">
           <div class="footer-item">
            <span >
                Địa chỉ: Lầu 5, tòa nhà SCIC, 16 Trương Định,
                 Phường Võ Thị Sáu, Quận 3, Tp. Hồ Chí Minh, Việt Nam
            </span>
            <span>Tổng đài: 1900-1533</span>
            <span>Hộp thư góp ý: jbvnfeedback@jollibee.com.vn</span>
            <span>
                Hoặc gửi phản hồi tại <a href="#">ĐÂY</a>
            </span>
           </div>
        </div>
        <div class="col l-3">
            <div class="footer-item">
                <img src="../img/logoPN__footer.png" alt="">
                <div class="footer__item-link">
                    <a href="#">Chính sách và quy định chung</a>
                    <a href="#">Chính sách hoạt động</a>
                    <a href="#">Liên hệ</a>
                    <a href="#">Chính sách bảo mật thông tin</a>
                </div>
            </div>
        </div>
        <div class="col l-3">
           <div class="footer-item">
            <span><h3>HÃY KẾT NỐI VỚI CHÚNG TÔI</h3></span>
            <div class="connection">
               <div class="connection-item">
                   <a href="#"><i class="fab fa-facebook-f"></i></a>
                </div>
                <div class="connection-item">
                    <a href="#"><i class="fab fa-google"></i></a>
                </div>
                
            </div>
           </div>
        </div>
    </div>
</div>
    `
}

footer();