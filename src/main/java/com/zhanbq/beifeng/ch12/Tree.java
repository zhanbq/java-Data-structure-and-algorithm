package com.zhanbq.beifeng.ch12;
/*
 * ��������
 */
public class Tree {
	//���ڵ�
	public Node root;
	
	/**
	 * ����ڵ�
	 * @param value
	 */
	public void insert(long value,String sValue) {
		//��װ�ڵ�
		Node newNode = new Node(value,sValue);
		//���õ�ǰ�ڵ�
		Node current = root;
		//���ø��ڵ�
		Node parent;
		//���rootΪnull��Ҳ���ǵ�һ�����ʱ��
		if(root == null) {
			root = newNode;
			return;
		} else {
			while(true) {
				//���ڵ�ָ��ǰ�ڵ�
				parent = current;
				//�����ǰָ��Ľڵ����ݱȲ����Ҫ��,��������
				if(current.data > value) {
					current = current.leftChild;
					if(current == null) {
						parent.leftChild = newNode;
						return;
					}
				} else {
					current = current.rightChild;
					if(current == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	
	/**
	 * ���ҽڵ�
	 * @param value
	 */
	public Node find(long value) {
		//���õ�ǰ�ڵ㣬�Ӹ��ڵ㿪ʼ
		Node current = root;
		//ѭ����ֻҪ����ֵ�����ڵ�ǰ�ڵ��������
		while(current.data != value) {
			//���бȽϣ��Ƚϲ���ֵ�͵�ǰ�ڵ�Ĵ�С
			if(current.data > value) {
				current = current.leftChild;
			} else {
				current = current.rightChild;
			}
			//������Ҳ���
			if(current == null) {
				return null;
			}
		}
		return current;
	}
	
	/**
	 * ɾ���ڵ�
	 * @param value
	 */
	public void delte(long value) {
		
	}
	
	/**
	 * ǰ�����
	 */
	public void frontOrder(Node localNode) {
		if(localNode != null) {
			//���ʸ��ڵ�
			System.out.println(localNode.data + ", " + localNode.sData);
			//ǰ�����������
			frontOrder(localNode.leftChild);
			//ǰ�����������
			frontOrder(localNode.rightChild);
		}
	}
	
	/**
	 * �������
	 */
	public void inOrder(Node localNode) {
		if(localNode != null) {
			//�������������
			inOrder(localNode.leftChild);
			//���ʸ��ڵ�
			System.out.println(localNode.data + ", " + localNode.sData);
			//��Ѯ����������
			inOrder(localNode.rightChild);
		}
	}
	
	/**
	 * �������
	 */
	public void afterOrder(Node localNode) {
		if(localNode != null) {
			//�������������
			afterOrder(localNode.leftChild);
			//�������������
			afterOrder(localNode.rightChild);
			//���ʸ��ڵ�
			System.out.println(localNode.data + ", " + localNode.sData);
		}
	}
}
