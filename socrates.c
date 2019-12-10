int main() {
    bool socratesIsAMan, socratesIsMortal,
    socratesIsRational, socratesIsBipedal;
    socratesIsMortal = false;
    socratesIsBipedal = true;
    if(!socratesIsMortal) {socratesIsAMan = false}
    if(!socratesIsAMan) {
        if(socratesIsRational) {socratesIsBipedal = false}
        if(socratesIsBipedal) {socratesIsRational = false}
    }
}