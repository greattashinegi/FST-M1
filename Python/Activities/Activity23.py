import pytest


def test_sum(inputValue):
    sum=0
    for n in inputValue:
        sum +=n

 assert sum==55