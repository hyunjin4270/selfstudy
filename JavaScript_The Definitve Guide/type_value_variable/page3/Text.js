console.log('two\nline');   // 두 행을 한 행으로 표현했다
console.log("one\
long\
line");                     // 한 행을 세 행으로 나눠 썼다

// 3.3.3 문자열 다루기
let s = "Hello, world!";
//문자열의 일부를 가져온다
console.log(s.substring(1,4));   //"ell", 부분적인 문자열 추출
console.log(s.slice(1,4));       //"ell", 똑같음
console.log(s.slice(-3));        //"ld!", 마지막 3글자 추출
console.log(s.split(","));       //'Hello', 'world!' ","을 기준으로 문자열을 나눔

//문자열 검색
console.log(s.indexOf("l"));     //2, l이 처음 나타나는 위치
console.log(s.indexOf("l", 3));  //3, 3번쨰 위치부터 l이 처음 나타나는 위치
console.log(s.indexOf("zz"));    //-1, 검색이 안될 경우 -1 반환 
console.log(s.lastIndexOf("l")); //10, l이 마지막으로 나타나는 위치

// 불리언을 반환하는 검색 함수
console.log(s.startsWith("Hell"));   //true, s 변수는 Hell로 시작하는게 맞음
console.log(s.endsWith("!"));        //true, s 변수는 !로 끝나는게 맞음
console.log(s.includes("or"));       //true, s 변수는 or이 들어있는게 맞음

//문자열 변경
console.log(s.replace("llo", "ya")); //Heya, world!
console.log(s.toLowerCase());        //hello, world!
console.log(s.toUpperCase());        //HELLO, WORLD!

//문자열의 각 16비트 문자를 검사
console.log(s.charAt(0));            //H, 첫번째위치 글자 반환
console.log(s.charAt(s.length - 1)); //!, 마지막 글자 반환
console.log(s.charCodeAt(0));        //72, 첫번 째 글자를 16비트 숫자로 반환
console.log(s.codePointAt(0));       //72, 16비트보다 큰 코드 포인트에서 동작

//패딩 함수
console.log("x".padStart(3));        //  x, 왼쪽에 스페이스를 2개 더한다     
console.log("x".padEnd(3));          //x  , 오른쪽에 스페이스를 2개 더한다
console.log("x".padStart(3,"*"));    //**x, 왼쪽에 *을 2개 더한다
console.log("x".padEnd(3,"*"));      //x**, 오른쪽에 *을 2개 더한다

//공백 제거
console.log(" test ".trim());        //test, 양쪽 공백을 제거한다
console.log(" test ".trimStart());   //test , 시작 공백을 제거한다
console.log(" test ".trimEnd());     // test, 마지막 공백을 제거한다

//그 외 문자열 메서드
console.log(s.concat("!"));          //Hello, world!!, !을 더한다
console.log("<>".repeat(5));         //<><><><><>, 5번 반복한다

//3.3.4 템플릿 리터럴
let name = "Bill";
let greeting = `Hello ${ name }`;
console.log(greeting);               // Hello Bill