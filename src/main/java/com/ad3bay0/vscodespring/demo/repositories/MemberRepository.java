package com.ad3bay0.vscodespring.demo.repositories;

import com.ad3bay0.vscodespring.demo.models.Member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member,Long>{
}