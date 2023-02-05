function solution(lottos, win_nums) {

  const rank = [6, 6, 5, 4, 3, 2, 1];
  const zero_cnt = lottos.filter(num => !num).length;
  const cnt = lottos.filter(num => win_nums.includes(num)).length;

  return [rank[zero_cnt+cnt], rank[cnt]];
}

let lottos = [7, 0, 0, 0, 0, 0];
let win_nums = [20, 9, 3, 45, 4, 35];
let result = solution(lottos, win_nums);
console.log(result);