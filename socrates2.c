int main() {
    // From #DEF:
    bool socratesIsAMan;
    bool socratesIsACat;
    bool socratesIsMortal;
    // From #ASRT:
    socratesIsAMan = false;
    // From #ARG
    if(!socratesIsAMan) {socratesIsACat = true} //asserted
    if(!socratesIsACat) {socratesIsAMan = true} //!asserted
    if(socratesIsACat) {socratesIsMortal = true} //asserted
    if(socratesIsAMan) {socratesIsACat = true} //!asserted
}