console.log('two\nline');   // �� ���� �� ������ ǥ���ߴ�
console.log("one\
long\
line");                     // �� ���� �� ������ ���� ���

// 3.3.3 ���ڿ� �ٷ��
let s = "Hello, world!";
//���ڿ��� �Ϻθ� �����´�
console.log(s.substring(1,4));   //"ell", �κ����� ���ڿ� ����
console.log(s.slice(1,4));       //"ell", �Ȱ���
console.log(s.slice(-3));        //"ld!", ������ 3���� ����
console.log(s.split(","));       //'Hello', 'world!' ","�� �������� ���ڿ��� ����

//���ڿ� �˻�
console.log(s.indexOf("l"));     //2, l�� ó�� ��Ÿ���� ��ġ
console.log(s.indexOf("l", 3));  //3, 3���� ��ġ���� l�� ó�� ��Ÿ���� ��ġ
console.log(s.indexOf("zz"));    //-1, �˻��� �ȵ� ��� -1 ��ȯ 
console.log(s.lastIndexOf("l")); //10, l�� ���������� ��Ÿ���� ��ġ

// �Ҹ����� ��ȯ�ϴ� �˻� �Լ�
console.log(s.startsWith("Hell"));   //true, s ������ Hell�� �����ϴ°� ����
console.log(s.endsWith("!"));        //true, s ������ !�� �����°� ����
console.log(s.includes("or"));       //true, s ������ or�� ����ִ°� ����

//���ڿ� ����
console.log(s.replace("llo", "ya")); //Heya, world!
console.log(s.toLowerCase());        //hello, world!
console.log(s.toUpperCase());        //HELLO, WORLD!

//���ڿ��� �� 16��Ʈ ���ڸ� �˻�
console.log(s.charAt(0));            //H, ù��°��ġ ���� ��ȯ
console.log(s.charAt(s.length - 1)); //!, ������ ���� ��ȯ
console.log(s.charCodeAt(0));        //72, ù�� ° ���ڸ� 16��Ʈ ���ڷ� ��ȯ
console.log(s.codePointAt(0));       //72, 16��Ʈ���� ū �ڵ� ����Ʈ���� ����

//�е� �Լ�
console.log("x".padStart(3));        //  x, ���ʿ� �����̽��� 2�� ���Ѵ�     
console.log("x".padEnd(3));          //x  , �����ʿ� �����̽��� 2�� ���Ѵ�
console.log("x".padStart(3,"*"));    //**x, ���ʿ� *�� 2�� ���Ѵ�
console.log("x".padEnd(3,"*"));      //x**, �����ʿ� *�� 2�� ���Ѵ�

//���� ����
console.log(" test ".trim());        //test, ���� ������ �����Ѵ�
console.log(" test ".trimStart());   //test , ���� ������ �����Ѵ�
console.log(" test ".trimEnd());     // test, ������ ������ �����Ѵ�

//�� �� ���ڿ� �޼���
console.log(s.concat("!"));          //Hello, world!!, !�� ���Ѵ�
console.log("<>".repeat(5));         //<><><><><>, 5�� �ݺ��Ѵ�

//3.3.4 ���ø� ���ͷ�
let name = "Bill";
let greeting = `Hello ${ name }`;
console.log(greeting);               // Hello Bill