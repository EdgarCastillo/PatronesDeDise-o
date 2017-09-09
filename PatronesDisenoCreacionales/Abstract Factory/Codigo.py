import random
class Musician:
    def __init__(self, Store=None):
        self.Music_Shop = Store

    def Play_Instrument(self):
        Instrument = self.Music_Shop.Sell_Instrument()
        print "The Musician bought a:", Instrument
        print "The Musician is ", Instrument.Strum()
        print "The Musician Also Bought a", self.Music_Shop.Sell_Case()

class Guitar:
    def Strum(self):
        return "Strumming the Guitar"
    def __str__(self):
        return "Guitar"
class Bass:
    def Strum(self):
        return "Strumming the Bass"
    def __str__(self):
        return "Bass"

class Music_Shop_One:
    def Sell_Instrument(self):
        return Guitar()
    def Sell_Case(self):
        return "Guitar Case"
class Music_Shop_Two:
    def Sell_Instrument(self):
        return Bass()
    def Sell_Case(self):
        return "Bass Case"
        
def get_factory():
    return random.choice([Music_Shop_One, Music_Shop_Two])()

Human = Musician()

for i in range(3):
    Human.Music_Shop = get_factory()
    Human.Play_Instrument()
    print "=" * 10
