package com.excilys.aflak.persistence;

public interface ICrudDAO<T> {

	default public void create(T obj) {
		throw new IllegalStateException("error implementation");
	}

	default public void find(Long id) {
		throw new IllegalStateException("error implementation");
	}

	default public void update(T Obj) {
		throw new IllegalStateException("error implementation");
	}

	default public void delete(Long id) {
		throw new IllegalStateException("error implementation");
	}

}
