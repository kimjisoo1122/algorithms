
let calculator = new Calculator();
calculator.read();

alert( "Sum=" + calculator.sum() );
alert( "Mul=" + calculator.mul() );

function Calculator() {
    this.read = function () {
        this.num1 = +prompt('숫잘르 입력하세요');
        this.num2 = +prompt('숫잘르 입력하세요');
    }

    this.sum = function () {
        return num1 + num2;
    };

}