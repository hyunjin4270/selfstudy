let billion = 1_000_000_000;    // ������ õ ���� �����ڷ� ���
let bytes = 0x89_AB_CD_EF;      // ����Ʈ �����ڷ� ���
let bits = 0b0001_1101_0111;    // 4��Ʈ �����ڷ� ���
let fraction = 0.123_456_789;   // �Ҽ��� �Ʒ� �κп��� �����ϴ�
console.log(billion, bytes, bits, fraction);

// 3.2.3 �ڹٽ�ũ��Ʈ�� ��� ����
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

// 3.2.6 ��¥�� �ð�

let timstamp = Date.now();  // ���� �ð��� Ÿ�ӽ�����(����) �������� ǥ���Ѵ�
let now = new Date();       // ���� �ð��� Date ��ü�� ǥ���Ѵ�
let ms = now.getTime();     // �и��� Ÿ�ӽ������� ��ȯ�Ѵ�
let iso = now.toISOString();// ǥ�� ������ ���ڿ��� ��ȯ�Ѵ�
console.log(timstamp);
console.log(now);
console.log(ms);
console.log(iso);
