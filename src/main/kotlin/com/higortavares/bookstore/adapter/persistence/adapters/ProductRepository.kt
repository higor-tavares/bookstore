package com.higortavares.bookstore.adapter.persistence.adapters

import com.higortavares.bookstore.domain.model.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository : JpaRepository<Product, Long> {
}