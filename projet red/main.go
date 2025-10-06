package main 

type character struct{
nom string
classe sttring
niveau int
pv int
pvmax int
inventaire []Item
}

type Item struct {
nom string
quantite int
}

func (player character) initcharacter(){
player = &character
}

func main() {
	p1 := character{}
	p1.initCharacter()
	
}