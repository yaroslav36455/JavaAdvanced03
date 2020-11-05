package ua.itea;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Dog extends Animal implements Cloneable, Externalizable {
	private Owner owner;
	
	public Dog() {
		
	}
	
	public Dog(String name, int age, Owner owner) {
		super(name, age);
		this.owner = owner;
	}

	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Dog [owner=" + owner + ", toString()=" + super.toString() + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		setName((String) in.readObject());
		setAge(in.readInt());
		setOwner((Owner) in.readObject());
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(getName());
		out.writeInt(getAge());
		out.writeObject(owner);
	}
}
