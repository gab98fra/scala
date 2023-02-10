var phrases=List("Crédito en Efectivo", "Crédito al Consumo", "Crédito Nómina Azteca", 
                 "Credito Pensionados Azteca", "Credito Prendario de Banco Azteca")

for (item <- phrases){
  item match{
  case "Crédito en Efectivo" => println("Tramitalo aquí y págalo desde la App")
  case "Crédito al Consumo" => println("Compra lo mejor para ti y tu familia")
  case "Crédito Nómina Azteca" => println("Tu Nómina Azteca te otorga un crédito")
  case "Credito Pensionados Azteca" => println("Crédito a los pensionados azteca")
  case "Credito Prendario de Banco Azteca" => println("Obten efectivo de inmediato, dejando en garantía prendas de oro")
  case _ => "Other"
    }
}

