let Fun = (name, age) => {
  this.name = name
  this.age = age
  return this.name+this.age
}

let p = new Fun('sai', 23)