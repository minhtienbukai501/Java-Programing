     
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>        
        
        <!--product-->
        <c:if test="${id_category == null}">
        <!--product-->
        <c:forEach items="${listCategory}" var = "category">
            <section>
                <div class="container my-5">
                    <header class="mb-4">
                        <h3>${category.name}</h3>
                    </header>

                    <div class="row">
                        <c:forEach items="${listProduct}" var = "product">
                            <c:if test="${category.id == product.id_category && product.status == 1}">
                                <div class="col-lg-3 col-md-6 col-sm-6 d-flex">
                                    <div class="card w-100 my-2 shadow-2-strong">
                                        <img src="./assets/images/${product.image}" class="card-img-top" style="aspect-ratio: 1 / 1" />
                                        <div class="card-body d-flex flex-column">
                                            <h5 class="card-title">${product.name}</h5>
                                            <p class="card-text">${product.price}$</p>
                                            <div class="card-footer d-flex align-items-end pt-3 px-0 pb-0 mt-auto">
                                                <a href="
                                                   <c:if test="${user==null}">
                                                       login
                                                   </c:if>
                                                   <c:if test="${user!=null}">
                                                       home?id_product=${product.id}
                                                   </c:if>   
                                                   " class="btn btn-primary shadow-0 me-1">Add to cart</a>    
                                                <a href="#!" class="btn btn-light border px-2 pt-2 icon-hover"><i class="fas fa-heart fa-lg text-secondary px-1"></i></a>
                                                 <image src ="./assets/icon/heart.png" width="37.6" height="37.6">
                                            </div>
                                        </div>
                                    </div>
                                </div>

                            </c:if>
                        </c:forEach>
                    </div>
                </div>
            </section>
        </c:forEach>
        </c:if>
        
        
        
        
        <c:if test="${id_category != null}">
            <c:forEach items="${listCategory}" var = "category">
                <c:if test= "${category.id==id_category}">
                <section>
                    <div class="container my-5">
                        <header class="mb-4">
                            <h3>${category.name}</h3>
                        </header>

                        <div class="row">
                            <c:forEach items="${listProduct}" var = "product">
                                <c:if test="${category.id == product.id_category }">
                                    <div class="col-lg-3 col-md-6 col-sm-6 d-flex">
                                        <div class="card w-100 my-2 shadow-2-strong">
                                            <img src="./assets/images/${product.image}" class="card-img-top" style="aspect-ratio: 1 / 1" />
                                            <div class="card-body d-flex flex-column">
                                                <h5 class="card-title">${product.name}</h5>
                                                <p class="card-text">${product.price}$</p>
                                                <div class="card-footer d-flex align-items-end pt-3 px-0 pb-0 mt-auto">
                                                    <a href="
                                                       <c:if test="${user==null}">
                                                       login
                                                        </c:if>
                                                        <c:if test= "${user!=null}">
                                                        home?id_product=${product.id}&id_category=${category.id}
                                                        </c:if>  
                                                       " class="btn btn-primary shadow-0 me-1">Add to cart</a>    
                                                    <a href="#!" class="btn btn-light border px-2 pt-2 icon-hover"><i class="fas fa-heart fa-lg text-secondary px-1"></i></a>
                                                     <image src ="./assets/icon/heart.png" width="37.6" height="37.6">
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                </c:if>
                            </c:forEach>
                        </div>
                    </div>
                </section>
                </c:if>
            </c:forEach>
        </c:if>