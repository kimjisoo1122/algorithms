function Closer() {
    let variable = 'test';

    return {
        getName : function () {
            return variable;
        },

        setName : function (arg) {
            variable = arg;
        }
    }
}

let closer = Closer();
let name = closer.getName();
console.log(name);