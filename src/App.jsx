import { prendas } from "./data";

function Prendas({products, size }){
return( 
  <div>
    <div>
<h3>Nombre: {products.name}</h3>
<h4>Id: {products.id}</h4>
<p>Categoría: {products.slug}</p>
    </div>
    <div>
<img src={products.image}
alt={products.name} 
width={50}
height={50}

/>
    </div>
  </div>
)
}

export default function Profile(){
  return(
    prendas.map((products)=>(
      <Prendas 
      key={products.id}
      products={{
        id: products.id,
        name: products.name,
        slug: products.slug,
        image: products.image,
        
      }}
      size={50}
      />
    ))
  )
}