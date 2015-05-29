akka-quick-sort
===============

Skeleton for scalabcn coding-dojo: http://www.meetup.com/Scala-Developers-Barcelona/events/221752186/

## Coding Dojo objective

The objective of the coding dojo is to construct a quick sort solution using **Akka actors**.

## Quick Sort Algorithm

The quick sort can be solved as a recursive algorithm that follows this steps:

1. Take one element of the list as a `pivot`
2. Divide the rest of list into two lists:
  *  The elements smaller than the _pivot_
  *  The elements greater than the _pivot_
3. Recursively follow steps 1. and 2. for the two divided lists.

  ![quicksort animation](http://upload.wikimedia.org/wikipedia/commons/6/6a/Sorting_quicksort_anim.gif)
  
  * Image from [Wikipedia](http://en.wikipedia.org/wiki/Quicksort)

At each step the processed list is at least 1 element smaller (the pivot). This is the condition of termination of this algorithm.

When sorting an empty list or a list with one element it returns the input value.

When it receives the result of the two recurive calls, it returns the _smaller list_ concatenated with the _pivot_ and the _greater list_.

## Quick Sort using Akka

The idea is to construct the algorithm using an Akka `Actor` to resolve each step, creating two new _actors_ to resolve the to sub-lists.

This algorithm will create a **binary tree** of _actors_. No optimizations are considered for this coding dojo.

Have fun!