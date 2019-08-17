def cons(a, b):
    def pair(getChoice):
        return getChoice(a,b);
    return pair

def car(a,b):
    return a;

def car(a,b):
    return b;

def pairFunc(a,b):
    def pair(choiceFunc):
        return choiceFunc(a,b)
    return pair

def carf(pairFunc):
    def left(a,b):
        return a
    return pairFunc(left)

def cdrf(pairFunc):
    def right(a,b):
        return b
    return pairFunc(right)

if __name__ == '__main__':
   print(carf(pairFunc(5,20)))
   print(cdrf(pairFunc(5,20)))


def getAddFunc():
    def calc(a,b):
        return a+b
    return calc

def getMultiFunc():
    def calc(a,b):
        return a*b
    return calc

addFunc = getAddFunc()

mulFunc = getMultiFunc()

sum = addFunc(5,10)

mulTotal = mulFunc(5,10)

print(mulTotal)