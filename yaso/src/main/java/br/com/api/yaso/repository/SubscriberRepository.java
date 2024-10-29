package br.com.api.yaso.repository;

import br.com.api.yaso.model.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;

 public interface SubscriberRepository extends JpaRepository<Subscriber, Long> {
}
