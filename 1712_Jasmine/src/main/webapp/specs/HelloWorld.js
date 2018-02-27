/**
 * 
 * @returns
 */

describe("this is my hello wold suite", function(){
	
	it("my first test", function(){
		
		expect(true).toBe(true);
	});
	
	var a = 100;
	it("my second test", function(){
		expect(a).toEqual(100);
	});
});

describe("2nd Suite", function(){
	beforeAll(function(){
		var foo = 100;
	})
	it("my failed test", function(){
		
		expect(false).toBe(true);
	});
	
	var b=200;
	it("another failed test", function(){
		expect(b).not.toEqual(200);
	});
});

describe("Suite 3", function(){
	var message = "foo bar baz"
	it("spec 3.0.0",function(){
		expect(message).not.toEqual("hello world");
	});
	describe("suite 3.1.0",function(){
		it("spec .1.1", function(){
			expect(message).toMatch(/bar/);
			expect(message).toMatch("bar");
			expect(message).not.toMatch("hello world");
		});
	});
	describe("suite 3.2.0", function(){
		it("spec 3.2.1", function(){
			expect(true).toEqual(true);
		});
	});
});
