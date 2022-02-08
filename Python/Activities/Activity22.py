import pytest
import math

def testadd_test():
    num1=10
    num2=20
    total=num1+num2
    assert total==30

def testsub_test():
    num1=30
    num2=20
    difference=num1-num2
    assert difference==10

@pytest.mark.activity
def testmul_test():
    num1=30
    num2=20
    prod=num1*num2
    assert prod==600

@pytest.mark.activity
def testdiv_test():
    num1=300
    num2=20
    ans=num1/num2
    assert ans==15
