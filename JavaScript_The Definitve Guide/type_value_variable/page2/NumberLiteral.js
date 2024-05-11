let billion = 1_000_000_000;    // 밑줄을 천 단위 구분자로 썼다
let bytes = 0x89_AB_CD_EF;      // 바이트 구분자로 썼다
let bits = 0b0001_1101_0111;    // 4비트 구분자로 썼다
let fraction = 0.123_456_789;   // 소수점 아래 부분에도 가능하다
console.log(billion, bytes, bits, fraction);

// 3.2.3 자바스크립트의 산술 연산
let infinity = Infinity;
infinity = Number.POSITIVE_INFINITY;
infinity = 1 / 0;
infinity = Number.MAX_VALUE * 2;
console.log(infinity);

let minusInfinity = -Infinity;
minusInfinity = Number.NEGATIVE_INFINITY;
minusInfinity = -1 / 0;
minusInfinity = -Number.MAX_VALUE * 2;
console.log(minusInfinity);

let nan = NaN;
nan = Number.NaN;
nan = 0 / 0;
nan = Infinity / Infinity;
console.log(nan);

let zero = Number.MIN_VALUE / 2;
zero = -Number.MIN_VALUE / 2;
zero = -1 / Infinity;
zero = -0;
console.log(zero);

// 3.2.6 날짜와 시간

let timstamp = Date.now();  // 현재 시간을 타임스탬프(숫자) 형식으로 표시한다
let now = new Date();       // 현재 시간을 Date 객체로 표시한다
let ms = now.getTime();     // 밀리초 타임스탬프로 변환한다
let iso = now.toISOString();// 표준 형식의 문자열로 반환한다
console.log(timstamp);
console.log(now);
console.log(ms);
console.log(iso);
