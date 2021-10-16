
function sliderHome() {
    var slider = document.querySelector(".slider");
    slider.innerHTML = `
            <div class="slider-item active">
                <a href="/thuc-don/mon-moi-mon-ngon" class="slider__item-link">
                    <img src="./img/slider__new1.jpg" alt="" class="slider__item-img">
                </a>
            </div>
            <div class="slider-item ">
                <a href="/thuc-don/mon-moi-mon-ngon" class="slider__item-link">
                    <img src="./img/slider__new2.jpg" alt="" class="slider__item-img">
                </a>
            </div>
            <div class="slider-item ">
                <a href="/thuc-don/mon-moi-mon-ngon" class="slider__item-link">
                    <img src="./img/slider__new3.jpg" alt="" class="slider__item-img">
                </a>
            </div>
            <div class="slider__btn">
                <a href="/thuc-don/mon-moi-mon-ngon" class="slider__btn-link"><h2>ĐẶT HÀNG</h2></a>
            </div>
    `
}

sliderHome()

var i = 0;
var j = 1;
var listImg = document.querySelectorAll(".slider-item");
var size = listImg.length;

function slideImg() {
    setInterval(function() {
        if(i == size) {
            i = 0;
        }
        if(j == size) {
            j = 0;
        }
        listImg[i].classList.add("slideOut")
        listImg[j].classList.add("slideIn");
        setTimeout(function() {

            listImg[i].classList.remove("active","slideOut");
            listImg[j].classList.add("active");
            listImg[j].classList.remove("slideIn");
            i++;
            j++;
        },700)
    },1700)
}

slideImg()