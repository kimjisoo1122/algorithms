const person1 = { name: 'Alice', age: 25 };
const person2 = { name: 'Bob', age: 27 };

const spec1 = { job: 'developer' };
const spec2 = { degree: 'doctor' };
const spec3 = { cert: 'photoshop' };

Object.assign(person1, spec1);
Object.assign(person2, spec1, spec2, spec3);

// console.log(person1);
// console.log(person2);

Object.seal(person1);
Object.freeze(person2);
//  Object의 정적 메소드를 사용해서
//  person1에는 spec1의 프로퍼티를,
//  person2에는 spec1, spec2, spec3 모두의 프로퍼티들을 더해보세요.

//  person1에 프로퍼티를 추가하거나 삭제하지 못하게 만들어보세요.
//  person2를 읽기만 가능한 객체로 만들어보세요.

const privates = ['height', 'weight']

const person3 = {
    name: '홍길동',
    sex: 'M',
    height: 175,
    weight: 70,
    family: ['부', '모', '누나'],
    profession: {
        job: 'developer',
        position: '사원',
        department: '프론트엔드'
    }
}

function deepFreeze(obj, notIncluedKeys = privates) {
    const result = {};
    for (const key in obj) {
        if (!notIncluedKeys.includes(key)) {
            if (typeof obj[key] === 'object' && !Array.isArray(obj[key])) {
                result[key] = deepFreeze(obj[key]);
            } else if (Array.isArray(obj[key])) {
                result[key] = [...obj[key]];
            } else {
                result[key] = obj[key];
            }
        }
    }
    return result;
}

let deepFreeze1 = deepFreeze(person3);

console.log(deepFreeze1)

let parse = JSON.parse(JSON.stringify(person3, (key ,value) => {
    if (privates.includes(key)) {
        return undefined;
    } else {
        return value;
    }
}));

console.log(parse);

//  위의 person1 객체를 privates에 속한 프로퍼티를 제외하고
//  깊은 복사를 하는 코드를 작성해보세요.