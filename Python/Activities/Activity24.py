import pytest
@pytest.fixture
def wallet_amount():
    amount = 0
    return amount

@pytest.mark.parametrize("earned,spend,expected",[(30,10,20),(20,2,18),])
def test_trans(wallet_amount,earned,spend,expected):
    wallet_amount=wallet_amount+earned
    wallet_amount=wallet_amount-spend
    assert wallet_amount==expected