def pair(a,b):
    def pair(calc):
        return calc(a,b)
    return pair

def add(pair):
    def calc(a,b):
        return a+b;
    return pair(calc)

def mul(pair):
    def calc(a,b):
        return a*b;
    return pair(calc)

if __name__ == '__main__':
    print(mul(pair(5,10)))
    print(add(pair(5,10)))
