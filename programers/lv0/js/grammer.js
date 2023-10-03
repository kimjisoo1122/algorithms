function solution(num_list) {
    const totalSum = num_list.reduce((prev, now) => prev + now, 0);
    const totalMulti = num_list.reduce((prev, now) => prev * now, 1);

    return totalMulti < Math.pow(totalSum, 2) ? 1 : 0;
}

console.log(solution([5, 7, 8, 3]));

function solution1(my_string, n) {
    return my_string.substring(0, n);
}

console.log(solution1('ProgrammerS123', 11));

function solution2(arr1, arr2) {
    const len1 = arr1.length;
    const len2 = arr2.length;

    if (len1 !== len2) {
        return len1 > len2 ? 1 : -1;
    }

    let reduce = arr1.reduce((a, b) => a + b);
    let reduce1 = arr2.reduce((a, b) => a + b);

    if (reduce === reduce1) {
        return 0;
    }
    return reduce > reduce1 ? 1 : -1;
}

console.log(solution2([49, 13], [70, 11, 2]));